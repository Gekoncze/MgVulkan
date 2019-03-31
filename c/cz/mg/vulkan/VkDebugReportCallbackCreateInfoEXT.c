#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDebugReportCallbackCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDebugReportCallbackCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkDebugReportCallbackCreateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDebugReportCallbackCreateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDebugReportCallbackCreateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDebugReportCallbackCreateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDebugReportCallbackCreateInfoEXT_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkDebugReportCallbackCreateInfoEXT_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkDebugReportCallbackCreateInfoEXT_getPfnCallback(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pfnCallback));
}

void Java_cz_mg_vulkan_vk_VkDebugReportCallbackCreateInfoEXT_setPfnCallback(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pfnCallback, jniLongToPointer(valueAddress), sizeof(o->pfnCallback));
}
jlong Java_cz_mg_vulkan_vk_VkDebugReportCallbackCreateInfoEXT_getPUserData(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pUserData));
}

void Java_cz_mg_vulkan_vk_VkDebugReportCallbackCreateInfoEXT_setPUserData(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugReportCallbackCreateInfoEXT* o = (VkDebugReportCallbackCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pUserData, jniLongToPointer(valueAddress), sizeof(o->pUserData));
}

