#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSwapchainCounterCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSwapchainCounterCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkSwapchainCounterCreateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCounterCreateInfoEXT* o = (VkSwapchainCounterCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCounterCreateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCounterCreateInfoEXT* o = (VkSwapchainCounterCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCounterCreateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCounterCreateInfoEXT* o = (VkSwapchainCounterCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCounterCreateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCounterCreateInfoEXT* o = (VkSwapchainCounterCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkSwapchainCounterCreateInfoEXT_getSurfaceCounters(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCounterCreateInfoEXT* o = (VkSwapchainCounterCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->surfaceCounters));
}

void Java_cz_mg_vulkan_vk_VkSwapchainCounterCreateInfoEXT_setSurfaceCounters(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCounterCreateInfoEXT* o = (VkSwapchainCounterCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->surfaceCounters, jniLongToPointer(valueAddress), sizeof(o->surfaceCounters));
}

