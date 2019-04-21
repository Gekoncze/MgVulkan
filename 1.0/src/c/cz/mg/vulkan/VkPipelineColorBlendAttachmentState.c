#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineColorBlendAttachmentState);
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getBlendEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->blendEnable);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setBlendEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->blendEnable, valuePointer, sizeof(o->blendEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getSrcColorBlendFactor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcColorBlendFactor);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setSrcColorBlendFactor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcColorBlendFactor, valuePointer, sizeof(o->srcColorBlendFactor));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getDstColorBlendFactor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstColorBlendFactor);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setDstColorBlendFactor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstColorBlendFactor, valuePointer, sizeof(o->dstColorBlendFactor));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getColorBlendOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->colorBlendOp);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setColorBlendOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->colorBlendOp, valuePointer, sizeof(o->colorBlendOp));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getSrcAlphaBlendFactor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcAlphaBlendFactor);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setSrcAlphaBlendFactor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcAlphaBlendFactor, valuePointer, sizeof(o->srcAlphaBlendFactor));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getDstAlphaBlendFactor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstAlphaBlendFactor);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setDstAlphaBlendFactor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstAlphaBlendFactor, valuePointer, sizeof(o->dstAlphaBlendFactor));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getAlphaBlendOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->alphaBlendOp);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setAlphaBlendOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->alphaBlendOp, valuePointer, sizeof(o->alphaBlendOp));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getColorWriteMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->colorWriteMask);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setColorWriteMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->colorWriteMask, valuePointer, sizeof(o->colorWriteMask));
}


