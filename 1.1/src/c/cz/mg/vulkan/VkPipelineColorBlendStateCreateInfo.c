#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineColorBlendStateCreateInfo);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPipelineColorBlendStateCreateInfo));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_getLogicOpEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->logicOpEnable);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_setLogicOpEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->logicOpEnable, valuePointer, sizeof(o->logicOpEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_getLogicOpNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->logicOp);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_setLogicOpNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->logicOp, valuePointer, sizeof(o->logicOp));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_getAttachmentCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->attachmentCount);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_setAttachmentCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->attachmentCount, valuePointer, sizeof(o->attachmentCount));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_getPAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pAttachments);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_setPAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pAttachments, &valuePointer, sizeof(o->pAttachments));
}

jlong Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_getBlendConstantsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->blendConstants);
}

void Java_cz_mg_vulkan_VkPipelineColorBlendStateCreateInfo_setBlendConstantsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->blendConstants, valuePointer, sizeof(o->blendConstants));
}


