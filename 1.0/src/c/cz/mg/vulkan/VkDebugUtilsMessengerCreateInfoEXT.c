#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDebugUtilsMessengerCreateInfoEXT);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDebugUtilsMessengerCreateInfoEXT));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_getMessageSeverityNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->messageSeverity);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_setMessageSeverityNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->messageSeverity, valuePointer, sizeof(o->messageSeverity));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_getMessageTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->messageType);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_setMessageTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->messageType, valuePointer, sizeof(o->messageType));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_getPfnUserCallbackNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->pfnUserCallback);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_setPfnUserCallbackNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pfnUserCallback, valuePointer, sizeof(o->pfnUserCallback));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_getPUserDataNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pUserData);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCreateInfoEXT_setPUserDataNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCreateInfoEXT* o = (VkDebugUtilsMessengerCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pUserData, &valuePointer, sizeof(o->pUserData));
}


