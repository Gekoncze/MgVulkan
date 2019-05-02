#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDevicePushDescriptorPropertiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDevicePushDescriptorPropertiesKHR);
}

void Java_cz_mg_vulkan_VkPhysicalDevicePushDescriptorPropertiesKHR_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDevicePushDescriptorPropertiesKHR));
}

jlong Java_cz_mg_vulkan_VkPhysicalDevicePushDescriptorPropertiesKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePushDescriptorPropertiesKHR* o = (VkPhysicalDevicePushDescriptorPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDevicePushDescriptorPropertiesKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePushDescriptorPropertiesKHR* o = (VkPhysicalDevicePushDescriptorPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDevicePushDescriptorPropertiesKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePushDescriptorPropertiesKHR* o = (VkPhysicalDevicePushDescriptorPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDevicePushDescriptorPropertiesKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePushDescriptorPropertiesKHR* o = (VkPhysicalDevicePushDescriptorPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDevicePushDescriptorPropertiesKHR_getMaxPushDescriptorsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePushDescriptorPropertiesKHR* o = (VkPhysicalDevicePushDescriptorPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxPushDescriptors);
}

void Java_cz_mg_vulkan_VkPhysicalDevicePushDescriptorPropertiesKHR_setMaxPushDescriptorsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePushDescriptorPropertiesKHR* o = (VkPhysicalDevicePushDescriptorPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxPushDescriptors, valuePointer, sizeof(o->maxPushDescriptors));
}


