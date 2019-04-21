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

jlong Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_getPfnCallback(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->pfnCallback);
}

void Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_setPfnCallback(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pfnCallback, valuePointer, sizeof(o->pfnCallback));
}

jlong Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_getPUserData(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pUserData);
}

void Java_cz_mg_vulkan_VkDebugReportCallbackCreateInfoEXT_setPUserData(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pUserData, &valuePointer, sizeof(o->pUserData));
}


