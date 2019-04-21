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

jlong Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_getDiscardRectangleMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->discardRectangleMode);
}

void Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_setDiscardRectangleMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->discardRectangleMode, valuePointer, sizeof(o->discardRectangleMode));
}

jlong Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_getDiscardRectangleCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->discardRectangleCount);
}

void Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_setDiscardRectangleCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->discardRectangleCount, valuePointer, sizeof(o->discardRectangleCount));
}

jlong Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_getPDiscardRectangles(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pDiscardRectangles);
}

void Java_cz_mg_vulkan_VkPipelineDiscardRectangleStateCreateInfoEXT_setPDiscardRectangles(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDiscardRectangles, &valuePointer, sizeof(o->pDiscardRectangles));
}


