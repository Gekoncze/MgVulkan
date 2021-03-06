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

void Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDisplayPresentInfoKHR));
}

jlong Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_getSrcRectNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcRect);
}

void Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_setSrcRectNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcRect, valuePointer, sizeof(o->srcRect));
}

jlong Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_getDstRectNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstRect);
}

void Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_setDstRectNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstRect, valuePointer, sizeof(o->dstRect));
}

jlong Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_getPersistentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->persistent);
}

void Java_cz_mg_vulkan_VkDisplayPresentInfoKHR_setPersistentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPresentInfoKHR* o = (VkDisplayPresentInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->persistent, valuePointer, sizeof(o->persistent));
}


