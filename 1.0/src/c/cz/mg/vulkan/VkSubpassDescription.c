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

jlong Java_cz_mg_vulkan_VkSubpassDescription_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPipelineBindPoint(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->pipelineBindPoint);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPipelineBindPoint(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pipelineBindPoint, valuePointer, sizeof(o->pipelineBindPoint));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getInputAttachmentCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->inputAttachmentCount);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setInputAttachmentCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->inputAttachmentCount, valuePointer, sizeof(o->inputAttachmentCount));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPInputAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(o->pInputAttachments);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPInputAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pInputAttachments, &valuePointer, sizeof(o->pInputAttachments));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getColorAttachmentCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->colorAttachmentCount);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setColorAttachmentCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->colorAttachmentCount, valuePointer, sizeof(o->colorAttachmentCount));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPColorAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(o->pColorAttachments);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPColorAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pColorAttachments, &valuePointer, sizeof(o->pColorAttachments));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPResolveAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(o->pResolveAttachments);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPResolveAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pResolveAttachments, &valuePointer, sizeof(o->pResolveAttachments));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPDepthStencilAttachment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(o->pDepthStencilAttachment);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPDepthStencilAttachment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDepthStencilAttachment, &valuePointer, sizeof(o->pDepthStencilAttachment));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPreserveAttachmentCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&o->preserveAttachmentCount);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPreserveAttachmentCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->preserveAttachmentCount, valuePointer, sizeof(o->preserveAttachmentCount));
}

jlong Java_cz_mg_vulkan_VkSubpassDescription_getPPreserveAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(o->pPreserveAttachments);
}

void Java_cz_mg_vulkan_VkSubpassDescription_setPPreserveAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pPreserveAttachments, &valuePointer, sizeof(o->pPreserveAttachments));
}


