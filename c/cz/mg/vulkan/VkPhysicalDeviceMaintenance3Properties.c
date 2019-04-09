#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_getMaxPerSetDescriptors(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPerSetDescriptors);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_setMaxPerSetDescriptors(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPerSetDescriptors, valuePointer, sizeof(o->maxPerSetDescriptors));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_getMaxMemoryAllocationSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxMemoryAllocationSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMaintenance3Properties_setMaxMemoryAllocationSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMaintenance3Properties* o = (VkPhysicalDeviceMaintenance3Properties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxMemoryAllocationSize, valuePointer, sizeof(o->maxMemoryAllocationSize));
}


