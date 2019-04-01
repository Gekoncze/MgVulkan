#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkFenceGetFdInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkFenceGetFdInfoKHR);
}

jlong Java_cz_mg_vulkan_vk_VkFenceGetFdInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFenceGetFdInfoKHR* o = (VkFenceGetFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkFenceGetFdInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFenceGetFdInfoKHR* o = (VkFenceGetFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkFenceGetFdInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFenceGetFdInfoKHR* o = (VkFenceGetFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkFenceGetFdInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFenceGetFdInfoKHR* o = (VkFenceGetFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkFenceGetFdInfoKHR_getFence(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFenceGetFdInfoKHR* o = (VkFenceGetFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->fence);
}

void Java_cz_mg_vulkan_vk_VkFenceGetFdInfoKHR_setFence(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFenceGetFdInfoKHR* o = (VkFenceGetFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fence, valuePointer, sizeof(o->fence));
}

jlong Java_cz_mg_vulkan_vk_VkFenceGetFdInfoKHR_getHandleType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFenceGetFdInfoKHR* o = (VkFenceGetFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->handleType);
}

void Java_cz_mg_vulkan_vk_VkFenceGetFdInfoKHR_setHandleType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFenceGetFdInfoKHR* o = (VkFenceGetFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->handleType, valuePointer, sizeof(o->handleType));
}


