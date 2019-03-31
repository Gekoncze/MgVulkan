#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendAdvancedStateCreateInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineColorBlendAdvancedStateCreateInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendAdvancedStateCreateInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAdvancedStateCreateInfoEXT* o = (VkPipelineColorBlendAdvancedStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineColorBlendAdvancedStateCreateInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAdvancedStateCreateInfoEXT* o = (VkPipelineColorBlendAdvancedStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendAdvancedStateCreateInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAdvancedStateCreateInfoEXT* o = (VkPipelineColorBlendAdvancedStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineColorBlendAdvancedStateCreateInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAdvancedStateCreateInfoEXT* o = (VkPipelineColorBlendAdvancedStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendAdvancedStateCreateInfoEXT_getSrcPremultiplied(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAdvancedStateCreateInfoEXT* o = (VkPipelineColorBlendAdvancedStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->srcPremultiplied));
}

void Java_cz_mg_vulkan_vk_VkPipelineColorBlendAdvancedStateCreateInfoEXT_setSrcPremultiplied(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAdvancedStateCreateInfoEXT* o = (VkPipelineColorBlendAdvancedStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->srcPremultiplied, jniLongToPointer(valueAddress), sizeof(o->srcPremultiplied));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendAdvancedStateCreateInfoEXT_getDstPremultiplied(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAdvancedStateCreateInfoEXT* o = (VkPipelineColorBlendAdvancedStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstPremultiplied));
}

void Java_cz_mg_vulkan_vk_VkPipelineColorBlendAdvancedStateCreateInfoEXT_setDstPremultiplied(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAdvancedStateCreateInfoEXT* o = (VkPipelineColorBlendAdvancedStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->dstPremultiplied, jniLongToPointer(valueAddress), sizeof(o->dstPremultiplied));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendAdvancedStateCreateInfoEXT_getBlendOverlap(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAdvancedStateCreateInfoEXT* o = (VkPipelineColorBlendAdvancedStateCreateInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->blendOverlap));
}

void Java_cz_mg_vulkan_vk_VkPipelineColorBlendAdvancedStateCreateInfoEXT_setBlendOverlap(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAdvancedStateCreateInfoEXT* o = (VkPipelineColorBlendAdvancedStateCreateInfoEXT*)jniLongToPointer(address);
    memcpy(&o->blendOverlap, jniLongToPointer(valueAddress), sizeof(o->blendOverlap));
}

