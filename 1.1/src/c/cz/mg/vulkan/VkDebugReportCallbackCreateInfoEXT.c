#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDebugReportCallbackCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_getPfnCallbackNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->pfnCallback);
}

void Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_setPfnCallbackNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pfnCallback, valuePointer, sizeof(o->pfnCallback));
}

jlong Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_getPUserDataNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pUserData);
}

void Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_setPUserDataNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pUserData, &valuePointer, sizeof(o->pUserData));
}


