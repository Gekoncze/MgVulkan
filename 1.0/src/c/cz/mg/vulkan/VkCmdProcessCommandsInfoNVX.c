#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkCmdProcessCommandsInfoNVX);
}

void Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkCmdProcessCommandsInfoNVX));
}

jlong Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_getObjectTableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectTable);
}

void Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_setObjectTableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectTable, valuePointer, sizeof(o->objectTable));
}

jlong Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_getIndirectCommandsLayoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->indirectCommandsLayout);
}

void Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_setIndirectCommandsLayoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->indirectCommandsLayout, valuePointer, sizeof(o->indirectCommandsLayout));
}

jlong Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_getIndirectCommandsTokenCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->indirectCommandsTokenCount);
}

void Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_setIndirectCommandsTokenCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->indirectCommandsTokenCount, valuePointer, sizeof(o->indirectCommandsTokenCount));
}

jlong Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_getPIndirectCommandsTokensNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pIndirectCommandsTokens);
}

void Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_setPIndirectCommandsTokensNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pIndirectCommandsTokens, &valuePointer, sizeof(o->pIndirectCommandsTokens));
}

jlong Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_getMaxSequencesCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSequencesCount);
}

void Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_setMaxSequencesCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSequencesCount, valuePointer, sizeof(o->maxSequencesCount));
}

jlong Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_getTargetCommandBufferNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->targetCommandBuffer);
}

void Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_setTargetCommandBufferNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->targetCommandBuffer, valuePointer, sizeof(o->targetCommandBuffer));
}

jlong Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_getSequencesCountBufferNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sequencesCountBuffer);
}

void Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_setSequencesCountBufferNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sequencesCountBuffer, valuePointer, sizeof(o->sequencesCountBuffer));
}

jlong Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_getSequencesCountOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sequencesCountOffset);
}

void Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_setSequencesCountOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sequencesCountOffset, valuePointer, sizeof(o->sequencesCountOffset));
}

jlong Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_getSequencesIndexBufferNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sequencesIndexBuffer);
}

void Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_setSequencesIndexBufferNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sequencesIndexBuffer, valuePointer, sizeof(o->sequencesIndexBuffer));
}

jlong Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_getSequencesIndexOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sequencesIndexOffset);
}

void Java_cz_mg_vulkan_VkCmdProcessCommandsInfoNVX_setSequencesIndexOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sequencesIndexOffset, valuePointer, sizeof(o->sequencesIndexOffset));
}


