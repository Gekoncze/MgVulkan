#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMemoryProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceMemoryProperties);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMemoryProperties_getMemoryTypeCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->memoryTypeCount));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceMemoryProperties_setMemoryTypeCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    memcpy(&o->memoryTypeCount, jniLongToPointer(valueAddress), sizeof(o->memoryTypeCount));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMemoryProperties_getMemoryTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->memoryTypes));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceMemoryProperties_setMemoryTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    memcpy(o->memoryTypes, jniLongToPointer(valueAddress), sizeof(o->memoryTypes));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMemoryProperties_getMemoryHeapCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->memoryHeapCount));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceMemoryProperties_setMemoryHeapCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    memcpy(&o->memoryHeapCount, jniLongToPointer(valueAddress), sizeof(o->memoryHeapCount));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDeviceMemoryProperties_getMemoryHeaps(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->memoryHeaps));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDeviceMemoryProperties_setMemoryHeaps(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMemoryProperties* o = (VkPhysicalDeviceMemoryProperties*)jniLongToPointer(address);
    memcpy(o->memoryHeaps, jniLongToPointer(valueAddress), sizeof(o->memoryHeaps));
}

