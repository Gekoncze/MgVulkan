#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSubpassDescription_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSubpassDescription);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkSubpassDescription));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPipelineBindPointNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineBindPoint);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPipelineBindPointNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineBindPoint, valuePointer, sizeof(o->pipelineBindPoint));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getInputAttachmentCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->inputAttachmentCount);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setInputAttachmentCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->inputAttachmentCount, valuePointer, sizeof(o->inputAttachmentCount));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPInputAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(o->pInputAttachments);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPInputAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pInputAttachments, &valuePointer, sizeof(o->pInputAttachments));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getColorAttachmentCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->colorAttachmentCount);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setColorAttachmentCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->colorAttachmentCount, valuePointer, sizeof(o->colorAttachmentCount));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPColorAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(o->pColorAttachments);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPColorAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pColorAttachments, &valuePointer, sizeof(o->pColorAttachments));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPResolveAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(o->pResolveAttachments);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPResolveAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pResolveAttachments, &valuePointer, sizeof(o->pResolveAttachments));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPDepthStencilAttachmentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(o->pDepthStencilAttachment);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPDepthStencilAttachmentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDepthStencilAttachment, &valuePointer, sizeof(o->pDepthStencilAttachment));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPreserveAttachmentCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->preserveAttachmentCount);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPreserveAttachmentCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->preserveAttachmentCount, valuePointer, sizeof(o->preserveAttachmentCount));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPPreserveAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(o->pPreserveAttachments);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPPreserveAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pPreserveAttachments, &valuePointer, sizeof(o->pPreserveAttachments));
}


