#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSwapchainCounterCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSwapchainCounterCreateInfoEXT);
}

void Java_cz_mg_vulkan_VkSwapchainCounterCreateInfoEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkSwapchainCounterCreateInfoEXT));
}

jlong Java_cz_mg_vulkan_VkSwapchainCounterCreateInfoEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCounterCreateInfoEXT* o = (VkSwapchainCounterCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkSwapchainCounterCreateInfoEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCounterCreateInfoEXT* o = (VkSwapchainCounterCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkSwapchainCounterCreateInfoEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCounterCreateInfoEXT* o = (VkSwapchainCounterCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkSwapchainCounterCreateInfoEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCounterCreateInfoEXT* o = (VkSwapchainCounterCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkSwapchainCounterCreateInfoEXT_getSurfaceCountersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSwapchainCounterCreateInfoEXT* o = (VkSwapchainCounterCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->surfaceCounters);
}

void Java_cz_mg_vulkan_VkSwapchainCounterCreateInfoEXT_setSurfaceCountersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSwapchainCounterCreateInfoEXT* o = (VkSwapchainCounterCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->surfaceCounters, valuePointer, sizeof(o->surfaceCounters));
}


