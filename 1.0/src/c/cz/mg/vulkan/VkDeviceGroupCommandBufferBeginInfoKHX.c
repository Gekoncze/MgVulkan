#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDeviceGroupCommandBufferBeginInfoKHX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupCommandBufferBeginInfoKHX);
}

jlong Java_cz_mg_vulkan_VkDeviceGroupCommandBufferBeginInfoKHX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupCommandBufferBeginInfoKHX* o = (VkDeviceGroupCommandBufferBeginInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceGroupCommandBufferBeginInfoKHX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupCommandBufferBeginInfoKHX* o = (VkDeviceGroupCommandBufferBeginInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupCommandBufferBeginInfoKHX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupCommandBufferBeginInfoKHX* o = (VkDeviceGroupCommandBufferBeginInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceGroupCommandBufferBeginInfoKHX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupCommandBufferBeginInfoKHX* o = (VkDeviceGroupCommandBufferBeginInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupCommandBufferBeginInfoKHX_getDeviceMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupCommandBufferBeginInfoKHX* o = (VkDeviceGroupCommandBufferBeginInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->deviceMask);
}

void Java_cz_mg_vulkan_VkDeviceGroupCommandBufferBeginInfoKHX_setDeviceMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupCommandBufferBeginInfoKHX* o = (VkDeviceGroupCommandBufferBeginInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->deviceMask, valuePointer, sizeof(o->deviceMask));
}


