#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkGraphicsPipelineCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getStageCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->stageCount));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setStageCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->stageCount, jniLongToPointer(valueAddress), sizeof(o->stageCount));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getPStages(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pStages));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setPStages(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pStages, jniLongToPointer(valueAddress), sizeof(o->pStages));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getPVertexInputState(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pVertexInputState));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setPVertexInputState(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pVertexInputState, jniLongToPointer(valueAddress), sizeof(o->pVertexInputState));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getPInputAssemblyState(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pInputAssemblyState));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setPInputAssemblyState(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pInputAssemblyState, jniLongToPointer(valueAddress), sizeof(o->pInputAssemblyState));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getPTessellationState(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pTessellationState));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setPTessellationState(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pTessellationState, jniLongToPointer(valueAddress), sizeof(o->pTessellationState));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getPViewportState(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pViewportState));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setPViewportState(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pViewportState, jniLongToPointer(valueAddress), sizeof(o->pViewportState));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getPRasterizationState(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pRasterizationState));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setPRasterizationState(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pRasterizationState, jniLongToPointer(valueAddress), sizeof(o->pRasterizationState));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getPMultisampleState(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pMultisampleState));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setPMultisampleState(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pMultisampleState, jniLongToPointer(valueAddress), sizeof(o->pMultisampleState));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getPDepthStencilState(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pDepthStencilState));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setPDepthStencilState(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pDepthStencilState, jniLongToPointer(valueAddress), sizeof(o->pDepthStencilState));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getPColorBlendState(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pColorBlendState));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setPColorBlendState(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pColorBlendState, jniLongToPointer(valueAddress), sizeof(o->pColorBlendState));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getPDynamicState(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pDynamicState));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setPDynamicState(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pDynamicState, jniLongToPointer(valueAddress), sizeof(o->pDynamicState));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->layout));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->layout, jniLongToPointer(valueAddress), sizeof(o->layout));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getRenderPass(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->renderPass));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setRenderPass(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->renderPass, jniLongToPointer(valueAddress), sizeof(o->renderPass));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getSubpass(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->subpass));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setSubpass(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->subpass, jniLongToPointer(valueAddress), sizeof(o->subpass));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getBasePipelineHandle(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->basePipelineHandle));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setBasePipelineHandle(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->basePipelineHandle, jniLongToPointer(valueAddress), sizeof(o->basePipelineHandle));
}
jlong Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_getBasePipelineIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->basePipelineIndex));
}

void Java_cz_mg_vulkan_vk_VkGraphicsPipelineCreateInfo_setBasePipelineIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkGraphicsPipelineCreateInfo* o = (VkGraphicsPipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->basePipelineIndex, jniLongToPointer(valueAddress), sizeof(o->basePipelineIndex));
}

