#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMemoryProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceMemoryProperties);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMemoryProperties_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDeviceMemoryProperties));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMemoryProperties_getMemoryTypeCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->memoryTypeCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMemoryProperties_setMemoryTypeCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memoryTypeCount, valuePointer, sizeof(o->memoryTypeCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMemoryProperties_getMemoryTypesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->memoryTypes);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMemoryProperties_setMemoryTypesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->memoryTypes, valuePointer, sizeof(o->memoryTypes));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMemoryProperties_getMemoryHeapCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->memoryHeapCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMemoryProperties_setMemoryHeapCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memoryHeapCount, valuePointer, sizeof(o->memoryHeapCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMemoryProperties_getMemoryHeapsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->memoryHeaps);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMemoryProperties_setMemoryHeapsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->memoryHeaps, valuePointer, sizeof(o->memoryHeaps));
}


