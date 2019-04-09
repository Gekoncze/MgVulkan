#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_getPipelineBindPoint(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineBindPoint);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_setPipelineBindPoint(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineBindPoint, valuePointer, sizeof(o->pipelineBindPoint));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_getTokenCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->tokenCount);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_setTokenCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tokenCount, valuePointer, sizeof(o->tokenCount));
}

jlong Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_getPTokens(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pTokens);
}

void Java_cz_mg_vulkan_VkIndirectCommandsLayoutCreateInfoNVX_setPTokens(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkIndirectCommandsLayoutCreateInfoNVX* o = (VkIndirectCommandsLayoutCreateInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pTokens, &valuePointer, sizeof(o->pTokens));
}


