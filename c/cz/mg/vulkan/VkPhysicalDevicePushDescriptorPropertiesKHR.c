#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPhysicalDevicePushDescriptorPropertiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDevicePushDescriptorPropertiesKHR);
}

jlong Java_cz_mg_vulkan_vk_VkPhysicalDevicePushDescriptorPropertiesKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePushDescriptorPropertiesKHR* o = (VkPhysicalDevicePushDescriptorPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevicePushDescriptorPropertiesKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePushDescriptorPropertiesKHR* o = (VkPhysicalDevicePushDescriptorPropertiesKHR*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDevicePushDescriptorPropertiesKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePushDescriptorPropertiesKHR* o = (VkPhysicalDevicePushDescriptorPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevicePushDescriptorPropertiesKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePushDescriptorPropertiesKHR* o = (VkPhysicalDevicePushDescriptorPropertiesKHR*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPhysicalDevicePushDescriptorPropertiesKHR_getMaxPushDescriptors(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePushDescriptorPropertiesKHR* o = (VkPhysicalDevicePushDescriptorPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxPushDescriptors));
}

void Java_cz_mg_vulkan_vk_VkPhysicalDevicePushDescriptorPropertiesKHR_setMaxPushDescriptors(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePushDescriptorPropertiesKHR* o = (VkPhysicalDevicePushDescriptorPropertiesKHR*)jniLongToPointer(address);
    memcpy(&o->maxPushDescriptors, jniLongToPointer(valueAddress), sizeof(o->maxPushDescriptors));
}

