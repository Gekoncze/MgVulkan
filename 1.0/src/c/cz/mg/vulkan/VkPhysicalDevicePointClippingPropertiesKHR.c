#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDevicePointClippingPropertiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDevicePointClippingPropertiesKHR);
}

jlong Java_cz_mg_vulkan_VkPhysicalDevicePointClippingPropertiesKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePointClippingPropertiesKHR* o = (VkPhysicalDevicePointClippingPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPhysicalDevicePointClippingPropertiesKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePointClippingPropertiesKHR* o = (VkPhysicalDevicePointClippingPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPhysicalDevicePointClippingPropertiesKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePointClippingPropertiesKHR* o = (VkPhysicalDevicePointClippingPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPhysicalDevicePointClippingPropertiesKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePointClippingPropertiesKHR* o = (VkPhysicalDevicePointClippingPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPhysicalDevicePointClippingPropertiesKHR_getPointClippingBehavior(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePointClippingPropertiesKHR* o = (VkPhysicalDevicePointClippingPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->pointClippingBehavior);
}

void Java_cz_mg_vulkan_VkPhysicalDevicePointClippingPropertiesKHR_setPointClippingBehavior(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDevicePointClippingPropertiesKHR* o = (VkPhysicalDevicePointClippingPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pointClippingBehavior, valuePointer, sizeof(o->pointClippingBehavior));
}


