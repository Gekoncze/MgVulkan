#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineViewportStateCreateInfo);
}

jlong Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_getViewportCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->viewportCount);
}

void Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_setViewportCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->viewportCount, valuePointer, sizeof(o->viewportCount));
}

jlong Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_getPViewports(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pViewports);
}

void Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_setPViewports(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pViewports, &valuePointer, sizeof(o->pViewports));
}

jlong Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_getScissorCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->scissorCount);
}

void Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_setScissorCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->scissorCount, valuePointer, sizeof(o->scissorCount));
}

jlong Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_getPScissors(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pScissors);
}

void Java_cz_mg_vulkan_VkPipelineViewportStateCreateInfo_setPScissors(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportStateCreateInfo* o = (VkPipelineViewportStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pScissors, &valuePointer, sizeof(o->pScissors));
}


