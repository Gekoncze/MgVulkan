#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupPresentCapabilitiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupPresentCapabilitiesKHR);
}

jlong Java_cz_mg_vulkan_vk_VkDeviceGroupPresentCapabilitiesKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupPresentCapabilitiesKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceGroupPresentCapabilitiesKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupPresentCapabilitiesKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceGroupPresentCapabilitiesKHR_getPresentMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->presentMask));
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupPresentCapabilitiesKHR_setPresentMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(o->presentMask, jniLongToPointer(valueAddress), sizeof(o->presentMask));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceGroupPresentCapabilitiesKHR_getModes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->modes));
}

void Java_cz_mg_vulkan_vk_VkDeviceGroupPresentCapabilitiesKHR_setModes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->modes, jniLongToPointer(valueAddress), sizeof(o->modes));
}

