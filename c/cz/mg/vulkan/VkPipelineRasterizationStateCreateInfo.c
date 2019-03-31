#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineRasterizationStateCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_getDepthClampEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthClampEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_setDepthClampEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->depthClampEnable, jniLongToPointer(valueAddress), sizeof(o->depthClampEnable));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_getRasterizerDiscardEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->rasterizerDiscardEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_setRasterizerDiscardEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->rasterizerDiscardEnable, jniLongToPointer(valueAddress), sizeof(o->rasterizerDiscardEnable));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_getPolygonMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->polygonMode));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_setPolygonMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->polygonMode, jniLongToPointer(valueAddress), sizeof(o->polygonMode));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_getCullMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->cullMode));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_setCullMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->cullMode, jniLongToPointer(valueAddress), sizeof(o->cullMode));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_getFrontFace(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->frontFace));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_setFrontFace(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->frontFace, jniLongToPointer(valueAddress), sizeof(o->frontFace));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_getDepthBiasEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthBiasEnable));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_setDepthBiasEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->depthBiasEnable, jniLongToPointer(valueAddress), sizeof(o->depthBiasEnable));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_getDepthBiasConstantFactor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthBiasConstantFactor));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_setDepthBiasConstantFactor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->depthBiasConstantFactor, jniLongToPointer(valueAddress), sizeof(o->depthBiasConstantFactor));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_getDepthBiasClamp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthBiasClamp));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_setDepthBiasClamp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->depthBiasClamp, jniLongToPointer(valueAddress), sizeof(o->depthBiasClamp));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_getDepthBiasSlopeFactor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthBiasSlopeFactor));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_setDepthBiasSlopeFactor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->depthBiasSlopeFactor, jniLongToPointer(valueAddress), sizeof(o->depthBiasSlopeFactor));
}
jlong Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_getLineWidth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->lineWidth));
}

void Java_cz_mg_vulkan_vk_VkPipelineRasterizationStateCreateInfo_setLineWidth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    memcpy(&o->lineWidth, jniLongToPointer(valueAddress), sizeof(o->lineWidth));
}

