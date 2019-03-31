#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSharedPresentSurfaceCapabilitiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSharedPresentSurfaceCapabilitiesKHR);
}

jlong Java_cz_mg_vulkan_vk_VkSharedPresentSurfaceCapabilitiesKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSharedPresentSurfaceCapabilitiesKHR* o = (VkSharedPresentSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkSharedPresentSurfaceCapabilitiesKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSharedPresentSurfaceCapabilitiesKHR* o = (VkSharedPresentSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkSharedPresentSurfaceCapabilitiesKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSharedPresentSurfaceCapabilitiesKHR* o = (VkSharedPresentSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkSharedPresentSurfaceCapabilitiesKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSharedPresentSurfaceCapabilitiesKHR* o = (VkSharedPresentSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkSharedPresentSurfaceCapabilitiesKHR_getSharedPresentSupportedUsageFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSharedPresentSurfaceCapabilitiesKHR* o = (VkSharedPresentSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sharedPresentSupportedUsageFlags));
}

void Java_cz_mg_vulkan_vk_VkSharedPresentSurfaceCapabilitiesKHR_setSharedPresentSupportedUsageFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSharedPresentSurfaceCapabilitiesKHR* o = (VkSharedPresentSurfaceCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->sharedPresentSupportedUsageFlags, jniLongToPointer(valueAddress), sizeof(o->sharedPresentSupportedUsageFlags));
}

