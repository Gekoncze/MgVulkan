#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDebugUtilsMessengerCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_getMessageSeverity(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->messageSeverity));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_setMessageSeverity(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->messageSeverity, jniLongToPointer(valueAddress), sizeof(o->messageSeverity));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_getMessageType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->messageType));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_setMessageType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->messageType, jniLongToPointer(valueAddress), sizeof(o->messageType));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_getPfnUserCallback(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pfnUserCallback));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_setPfnUserCallback(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pfnUserCallback, jniLongToPointer(valueAddress), sizeof(o->pfnUserCallback));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_getPUserData(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pUserData));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsMessengerCreateInfoEXT_setPUserData(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pUserData, jniLongToPointer(valueAddress), sizeof(o->pUserData));
}

