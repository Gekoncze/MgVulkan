#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineDiscardRectangleStateCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_getDiscardRectangleModeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->discardRectangleMode);
}

void Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_setDiscardRectangleModeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->discardRectangleMode, valuePointer, sizeof(o->discardRectangleMode));
}

jlong Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_getDiscardRectangleCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->discardRectangleCount);
}

void Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_setDiscardRectangleCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->discardRectangleCount, valuePointer, sizeof(o->discardRectangleCount));
}

jlong Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_getPDiscardRectanglesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pDiscardRectangles);
}

void Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_setPDiscardRectanglesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDiscardRectangles, &valuePointer, sizeof(o->pDiscardRectangles));
}


