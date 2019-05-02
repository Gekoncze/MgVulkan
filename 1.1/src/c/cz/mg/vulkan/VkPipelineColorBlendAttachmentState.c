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

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPipelineColorBlendAttachmentState));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getBlendEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->blendEnable);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setBlendEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->blendEnable, valuePointer, sizeof(o->blendEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getSrcColorBlendFactorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcColorBlendFactor);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setSrcColorBlendFactorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcColorBlendFactor, valuePointer, sizeof(o->srcColorBlendFactor));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getDstColorBlendFactorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstColorBlendFactor);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setDstColorBlendFactorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstColorBlendFactor, valuePointer, sizeof(o->dstColorBlendFactor));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getColorBlendOpNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->colorBlendOp);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setColorBlendOpNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->colorBlendOp, valuePointer, sizeof(o->colorBlendOp));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getSrcAlphaBlendFactorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcAlphaBlendFactor);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setSrcAlphaBlendFactorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcAlphaBlendFactor, valuePointer, sizeof(o->srcAlphaBlendFactor));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getDstAlphaBlendFactorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstAlphaBlendFactor);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setDstAlphaBlendFactorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstAlphaBlendFactor, valuePointer, sizeof(o->dstAlphaBlendFactor));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getAlphaBlendOpNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->alphaBlendOp);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setAlphaBlendOpNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->alphaBlendOp, valuePointer, sizeof(o->alphaBlendOp));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_getColorWriteMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    return jniPointerToLong(&o->colorWriteMask);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendAttachmentState_setColorWriteMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendAttachmentState* o = (VkPipelineColorBlendAttachmentState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->colorWriteMask, valuePointer, sizeof(o->colorWriteMask));
}


