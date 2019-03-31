#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPresentTimesInfoGOOGLE_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPresentTimesInfoGOOGLE);
}

jlong Java_cz_mg_vulkan_vk_VkPresentTimesInfoGOOGLE_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentTimesInfoGOOGLE* o = (VkPresentTimesInfoGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPresentTimesInfoGOOGLE_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentTimesInfoGOOGLE* o = (VkPresentTimesInfoGOOGLE*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPresentTimesInfoGOOGLE_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentTimesInfoGOOGLE* o = (VkPresentTimesInfoGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPresentTimesInfoGOOGLE_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentTimesInfoGOOGLE* o = (VkPresentTimesInfoGOOGLE*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPresentTimesInfoGOOGLE_getSwapchainCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentTimesInfoGOOGLE* o = (VkPresentTimesInfoGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&(o->swapchainCount));
}

void Java_cz_mg_vulkan_vk_VkPresentTimesInfoGOOGLE_setSwapchainCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentTimesInfoGOOGLE* o = (VkPresentTimesInfoGOOGLE*)jniLongToPointer(address);
    memcpy(&o->swapchainCount, jniLongToPointer(valueAddress), sizeof(o->swapchainCount));
}
jlong Java_cz_mg_vulkan_vk_VkPresentTimesInfoGOOGLE_getPTimes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPresentTimesInfoGOOGLE* o = (VkPresentTimesInfoGOOGLE*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pTimes));
}

void Java_cz_mg_vulkan_vk_VkPresentTimesInfoGOOGLE_setPTimes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPresentTimesInfoGOOGLE* o = (VkPresentTimesInfoGOOGLE*)jniLongToPointer(address);
    memcpy(&o->pTimes, jniLongToPointer(valueAddress), sizeof(o->pTimes));
}

