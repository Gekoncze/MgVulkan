#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineViewportSwizzleStateCreateInfoNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineViewportSwizzleStateCreateInfoNV);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineViewportSwizzleStateCreateInfoNV_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportSwizzleStateCreateInfoNV* o = (VkPipelineViewportSwizzleStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportSwizzleStateCreateInfoNV_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportSwizzleStateCreateInfoNV* o = (VkPipelineViewportSwizzleStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportSwizzleStateCreateInfoNV_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportSwizzleStateCreateInfoNV* o = (VkPipelineViewportSwizzleStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportSwizzleStateCreateInfoNV_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportSwizzleStateCreateInfoNV* o = (VkPipelineViewportSwizzleStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportSwizzleStateCreateInfoNV_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportSwizzleStateCreateInfoNV* o = (VkPipelineViewportSwizzleStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportSwizzleStateCreateInfoNV_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportSwizzleStateCreateInfoNV* o = (VkPipelineViewportSwizzleStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportSwizzleStateCreateInfoNV_getViewportCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportSwizzleStateCreateInfoNV* o = (VkPipelineViewportSwizzleStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->viewportCount));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportSwizzleStateCreateInfoNV_setViewportCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportSwizzleStateCreateInfoNV* o = (VkPipelineViewportSwizzleStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->viewportCount, jniLongToPointer(valueAddress), sizeof(o->viewportCount));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportSwizzleStateCreateInfoNV_getPViewportSwizzles(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportSwizzleStateCreateInfoNV* o = (VkPipelineViewportSwizzleStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pViewportSwizzles));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportSwizzleStateCreateInfoNV_setPViewportSwizzles(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportSwizzleStateCreateInfoNV* o = (VkPipelineViewportSwizzleStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->pViewportSwizzles, jniLongToPointer(valueAddress), sizeof(o->pViewportSwizzles));
}

