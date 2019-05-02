#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkIndirectCommandsLayoutCreateInfoNVX);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkIndirectCommandsLayoutCreateInfoNVX));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_getPipelineBindPointNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineBindPoint);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_setPipelineBindPointNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineBindPoint, valuePointer, sizeof(o->pipelineBindPoint));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_getTokenCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->tokenCount);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_setTokenCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tokenCount, valuePointer, sizeof(o->tokenCount));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_getPTokensNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pTokens);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_setPTokensNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pTokens, &valuePointer, sizeof(o->pTokens));
}


