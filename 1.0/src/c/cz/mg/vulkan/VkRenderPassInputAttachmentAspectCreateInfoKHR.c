#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRenderPassInputAttachmentAspectCreateInfoKHR);
}

jlong Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfoKHR* o = (VkRenderPassInputAttachmentAspectCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfoKHR* o = (VkRenderPassInputAttachmentAspectCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfoKHR* o = (VkRenderPassInputAttachmentAspectCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfoKHR* o = (VkRenderPassInputAttachmentAspectCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfoKHR_getAspectReferenceCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfoKHR* o = (VkRenderPassInputAttachmentAspectCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->aspectReferenceCount);
}

void Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfoKHR_setAspectReferenceCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfoKHR* o = (VkRenderPassInputAttachmentAspectCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->aspectReferenceCount, valuePointer, sizeof(o->aspectReferenceCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfoKHR_getPAspectReferences(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfoKHR* o = (VkRenderPassInputAttachmentAspectCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pAspectReferences);
}

void Java_cz_mg_vulkan_VkRenderPassInputAttachmentAspectCreateInfoKHR_setPAspectReferences(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassInputAttachmentAspectCreateInfoKHR* o = (VkRenderPassInputAttachmentAspectCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pAspectReferences, &valuePointer, sizeof(o->pAspectReferences));
}


