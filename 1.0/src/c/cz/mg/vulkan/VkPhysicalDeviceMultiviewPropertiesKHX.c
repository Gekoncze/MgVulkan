#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewPropertiesKHX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceMultiviewPropertiesKHX);
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewPropertiesKHX_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewPropertiesKHX* o = (VkPhysicalDeviceMultiviewPropertiesKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewPropertiesKHX_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewPropertiesKHX* o = (VkPhysicalDeviceMultiviewPropertiesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewPropertiesKHX_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewPropertiesKHX* o = (VkPhysicalDeviceMultiviewPropertiesKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewPropertiesKHX_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewPropertiesKHX* o = (VkPhysicalDeviceMultiviewPropertiesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewPropertiesKHX_getMaxMultiviewViewCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewPropertiesKHX* o = (VkPhysicalDeviceMultiviewPropertiesKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxMultiviewViewCount);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewPropertiesKHX_setMaxMultiviewViewCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewPropertiesKHX* o = (VkPhysicalDeviceMultiviewPropertiesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxMultiviewViewCount, valuePointer, sizeof(o->maxMultiviewViewCount));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewPropertiesKHX_getMaxMultiviewInstanceIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewPropertiesKHX* o = (VkPhysicalDeviceMultiviewPropertiesKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxMultiviewInstanceIndex);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceMultiviewPropertiesKHX_setMaxMultiviewInstanceIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceMultiviewPropertiesKHX* o = (VkPhysicalDeviceMultiviewPropertiesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxMultiviewInstanceIndex, valuePointer, sizeof(o->maxMultiviewInstanceIndex));
}


