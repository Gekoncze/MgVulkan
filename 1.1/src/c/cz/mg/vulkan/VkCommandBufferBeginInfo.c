#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkCommandBufferBeginInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkCommandBufferBeginInfo);
}

void Java_cz_mg_vulkan_VkCommandBufferBeginInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkCommandBufferBeginInfo));
}

jlong Java_cz_mg_vulkan_VkCommandBufferBeginInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferBeginInfo* o = (VkCommandBufferBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkCommandBufferBeginInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferBeginInfo* o = (VkCommandBufferBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkCommandBufferBeginInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferBeginInfo* o = (VkCommandBufferBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkCommandBufferBeginInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferBeginInfo* o = (VkCommandBufferBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkCommandBufferBeginInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferBeginInfo* o = (VkCommandBufferBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkCommandBufferBeginInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferBeginInfo* o = (VkCommandBufferBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkCommandBufferBeginInfo_getPInheritanceInfoNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCommandBufferBeginInfo* o = (VkCommandBufferBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pInheritanceInfo);
}

void Java_cz_mg_vulkan_VkCommandBufferBeginInfo_setPInheritanceInfoNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCommandBufferBeginInfo* o = (VkCommandBufferBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pInheritanceInfo, &valuePointer, sizeof(o->pInheritanceInfo));
}


