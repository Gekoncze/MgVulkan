#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupPresentCapabilitiesKHR);
}

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHR_getPresentMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->presentMask);
}

void Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHR_setPresentMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->presentMask, valuePointer, sizeof(o->presentMask));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHR_getModesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->modes);
}

void Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHR_setModesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHR* o = (VkDeviceGroupPresentCapabilitiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->modes, valuePointer, sizeof(o->modes));
}


