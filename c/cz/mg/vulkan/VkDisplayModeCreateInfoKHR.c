#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDisplayModeCreateInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDisplayModeCreateInfoKHR);
}

jlong Java_cz_mg_vulkan_vk_VkDisplayModeCreateInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayModeCreateInfoKHR* o = (VkDisplayModeCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDisplayModeCreateInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayModeCreateInfoKHR* o = (VkDisplayModeCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayModeCreateInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayModeCreateInfoKHR* o = (VkDisplayModeCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDisplayModeCreateInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayModeCreateInfoKHR* o = (VkDisplayModeCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayModeCreateInfoKHR_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayModeCreateInfoKHR* o = (VkDisplayModeCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkDisplayModeCreateInfoKHR_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayModeCreateInfoKHR* o = (VkDisplayModeCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayModeCreateInfoKHR_getParameters(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayModeCreateInfoKHR* o = (VkDisplayModeCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->parameters));
}

void Java_cz_mg_vulkan_vk_VkDisplayModeCreateInfoKHR_setParameters(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayModeCreateInfoKHR* o = (VkDisplayModeCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->parameters, jniLongToPointer(valueAddress), sizeof(o->parameters));
}

