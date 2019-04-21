#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDisplayPresentInfoKHR);
}

jlong Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_getSrcRect(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcRect);
}

void Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_setSrcRect(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcRect, valuePointer, sizeof(o->srcRect));
}

jlong Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_getDstRect(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstRect);
}

void Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_setDstRect(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstRect, valuePointer, sizeof(o->dstRect));
}

jlong Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_getPersistent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->persistent);
}

void Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_setPersistent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->persistent, valuePointer, sizeof(o->persistent));
}


