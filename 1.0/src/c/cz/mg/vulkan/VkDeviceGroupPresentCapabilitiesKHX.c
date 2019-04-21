#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupPresentCapabilitiesKHX);
}

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHX* o = (VkDeviceGroupPresentCapabilitiesKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHX* o = (VkDeviceGroupPresentCapabilitiesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHX* o = (VkDeviceGroupPresentCapabilitiesKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHX* o = (VkDeviceGroupPresentCapabilitiesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHX_getPresentMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHX* o = (VkDeviceGroupPresentCapabilitiesKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->presentMask);
}

void Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHX_setPresentMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHX* o = (VkDeviceGroupPresentCapabilitiesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->presentMask, valuePointer, sizeof(o->presentMask));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHX_getModes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHX* o = (VkDeviceGroupPresentCapabilitiesKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->modes);
}

void Java_cz_mg_vulkan_VkDeviceGroupPresentCapabilitiesKHX_setModes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupPresentCapabilitiesKHX* o = (VkDeviceGroupPresentCapabilitiesKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->modes, valuePointer, sizeof(o->modes));
}


