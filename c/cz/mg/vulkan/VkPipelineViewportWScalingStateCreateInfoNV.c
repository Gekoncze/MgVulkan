#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineViewportWScalingStateCreateInfoNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineViewportWScalingStateCreateInfoNV);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineViewportWScalingStateCreateInfoNV_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportWScalingStateCreateInfoNV_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportWScalingStateCreateInfoNV_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportWScalingStateCreateInfoNV_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportWScalingStateCreateInfoNV_getViewportWScalingEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->viewportWScalingEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportWScalingStateCreateInfoNV_setViewportWScalingEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->viewportWScalingEnable, jniLongToPointer(valueAddress), sizeof(o->viewportWScalingEnable));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportWScalingStateCreateInfoNV_getViewportCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->viewportCount));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportWScalingStateCreateInfoNV_setViewportCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->viewportCount, jniLongToPointer(valueAddress), sizeof(o->viewportCount));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineViewportWScalingStateCreateInfoNV_getPViewportWScalings(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pViewportWScalings));
}

void Java_cz_mg_vulkan_vk_VkPipelineViewportWScalingStateCreateInfoNV_setPViewportWScalings(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    memcpy(&o->pViewportWScalings, jniLongToPointer(valueAddress), sizeof(o->pViewportWScalings));
}

