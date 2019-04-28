#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceMaintenance3Properties);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_getMaxPerSetDescriptorsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerSetDescriptors);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_setMaxPerSetDescriptorsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerSetDescriptors, valuePointer, sizeof(o->maxPerSetDescriptors));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_getMaxMemoryAllocationSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxMemoryAllocationSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_setMaxMemoryAllocationSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxMemoryAllocationSize, valuePointer, sizeof(o->maxMemoryAllocationSize));
}


