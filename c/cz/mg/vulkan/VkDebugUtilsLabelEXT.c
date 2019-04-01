#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDebugUtilsLabelEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDebugUtilsLabelEXT);
}

jlong Java_cz_mg_vulkan_vk_VkDebugUtilsLabelEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsLabelEXT* o = (VkDebugUtilsLabelEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsLabelEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsLabelEXT* o = (VkDebugUtilsLabelEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkDebugUtilsLabelEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsLabelEXT* o = (VkDebugUtilsLabelEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsLabelEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsLabelEXT* o = (VkDebugUtilsLabelEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkDebugUtilsLabelEXT_getPLabelName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsLabelEXT* o = (VkDebugUtilsLabelEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pLabelName);
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsLabelEXT_setPLabelName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsLabelEXT* o = (VkDebugUtilsLabelEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pLabelName, &valuePointer, sizeof(o->pLabelName));
}

jlong Java_cz_mg_vulkan_vk_VkDebugUtilsLabelEXT_getColor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsLabelEXT* o = (VkDebugUtilsLabelEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->color);
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsLabelEXT_setColor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsLabelEXT* o = (VkDebugUtilsLabelEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->color, valuePointer, sizeof(o->color));
}


