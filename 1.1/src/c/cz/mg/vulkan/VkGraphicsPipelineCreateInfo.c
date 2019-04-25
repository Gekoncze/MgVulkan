#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkGraphicsPipelineCreateInfo);
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getStageCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->stageCount);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setStageCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stageCount, valuePointer, sizeof(o->stageCount));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getPStagesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pStages);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setPStagesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pStages, &valuePointer, sizeof(o->pStages));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getPVertexInputStateNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pVertexInputState);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setPVertexInputStateNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pVertexInputState, &valuePointer, sizeof(o->pVertexInputState));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getPInputAssemblyStateNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pInputAssemblyState);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setPInputAssemblyStateNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pInputAssemblyState, &valuePointer, sizeof(o->pInputAssemblyState));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getPTessellationStateNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pTessellationState);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setPTessellationStateNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pTessellationState, &valuePointer, sizeof(o->pTessellationState));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getPViewportStateNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pViewportState);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setPViewportStateNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pViewportState, &valuePointer, sizeof(o->pViewportState));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getPRasterizationStateNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pRasterizationState);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setPRasterizationStateNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pRasterizationState, &valuePointer, sizeof(o->pRasterizationState));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getPMultisampleStateNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pMultisampleState);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setPMultisampleStateNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pMultisampleState, &valuePointer, sizeof(o->pMultisampleState));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getPDepthStencilStateNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pDepthStencilState);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setPDepthStencilStateNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDepthStencilState, &valuePointer, sizeof(o->pDepthStencilState));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getPColorBlendStateNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pColorBlendState);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setPColorBlendStateNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pColorBlendState, &valuePointer, sizeof(o->pColorBlendState));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getPDynamicStateNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pDynamicState);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setPDynamicStateNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDynamicState, &valuePointer, sizeof(o->pDynamicState));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getLayoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->layout);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setLayoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->layout, valuePointer, sizeof(o->layout));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getRenderPassNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->renderPass);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setRenderPassNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->renderPass, valuePointer, sizeof(o->renderPass));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getSubpassNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->subpass);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setSubpassNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subpass, valuePointer, sizeof(o->subpass));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getBasePipelineHandleNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->basePipelineHandle);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setBasePipelineHandleNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->basePipelineHandle, valuePointer, sizeof(o->basePipelineHandle));
}

jlong Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_getBasePipelineIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->basePipelineIndex);
}

void Java_cz_mg_vulkan_VkGraphicsPipelineCreateInfo_setBasePipelineIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->basePipelineIndex, valuePointer, sizeof(o->basePipelineIndex));
}


