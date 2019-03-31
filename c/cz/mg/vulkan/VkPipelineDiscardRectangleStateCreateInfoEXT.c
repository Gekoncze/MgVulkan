#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineDiscardRectangleStateCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineDiscardRectangleStateCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineDiscardRectangleStateCreateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineDiscardRectangleStateCreateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDiscardRectangleStateCreateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineDiscardRectangleStateCreateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDiscardRectangleStateCreateInfoEXT_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkPipelineDiscardRectangleStateCreateInfoEXT_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDiscardRectangleStateCreateInfoEXT_getDiscardRectangleMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->discardRectangleMode));
}

void Java_cz_mg_vulkan_vk_VkPipelineDiscardRectangleStateCreateInfoEXT_setDiscardRectangleMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->discardRectangleMode, jniLongToPointer(valueAddress), sizeof(o->discardRectangleMode));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDiscardRectangleStateCreateInfoEXT_getDiscardRectangleCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->discardRectangleCount));
}

void Java_cz_mg_vulkan_vk_VkPipelineDiscardRectangleStateCreateInfoEXT_setDiscardRectangleCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->discardRectangleCount, jniLongToPointer(valueAddress), sizeof(o->discardRectangleCount));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineDiscardRectangleStateCreateInfoEXT_getPDiscardRectangles(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pDiscardRectangles));
}

void Java_cz_mg_vulkan_vk_VkPipelineDiscardRectangleStateCreateInfoEXT_setPDiscardRectangles(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineDiscardRectangleStateCreateInfoEXT* o = (VkPipelineDiscardRectangleStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pDiscardRectangles, jniLongToPointer(valueAddress), sizeof(o->pDiscardRectangles));
}

