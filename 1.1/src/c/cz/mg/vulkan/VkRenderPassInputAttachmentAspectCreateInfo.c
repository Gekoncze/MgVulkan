#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRenderPassInputAttachmentAspectCreateInfo);
}

void Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkRenderPassInputAttachmentAspectCreateInfo));
}

jlong Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfo* o = (VkRenderPassInputAttachmentAspectCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfo* o = (VkRenderPassInputAttachmentAspectCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfo* o = (VkRenderPassInputAttachmentAspectCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfo* o = (VkRenderPassInputAttachmentAspectCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfo_getAspectReferenceCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfo* o = (VkRenderPassInputAttachmentAspectCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->aspectReferenceCount);
}

void Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfo_setAspectReferenceCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfo* o = (VkRenderPassInputAttachmentAspectCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->aspectReferenceCount, valuePointer, sizeof(o->aspectReferenceCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfo_getPAspectReferencesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfo* o = (VkRenderPassInputAttachmentAspectCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pAspectReferences);
}

void Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfo_setPAspectReferencesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfo* o = (VkRenderPassInputAttachmentAspectCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pAspectReferences, &valuePointer, sizeof(o->pAspectReferences));
}


