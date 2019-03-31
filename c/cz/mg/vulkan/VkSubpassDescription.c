#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSubpassDescription_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSubpassDescription);
}

jlong Java_cz_mg_vulkan_vk_VkSubpassDescription_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkSubpassDescription_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkSubpassDescription_getPipelineBindPoint(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pipelineBindPoint));
}

void Java_cz_mg_vulkan_vk_VkSubpassDescription_setPipelineBindPoint(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    memcpy(&o->pipelineBindPoint, jniLongToPointer(valueAddress), sizeof(o->pipelineBindPoint));
}
jlong Java_cz_mg_vulkan_vk_VkSubpassDescription_getInputAttachmentCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->inputAttachmentCount));
}

void Java_cz_mg_vulkan_vk_VkSubpassDescription_setInputAttachmentCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    memcpy(&o->inputAttachmentCount, jniLongToPointer(valueAddress), sizeof(o->inputAttachmentCount));
}
jlong Java_cz_mg_vulkan_vk_VkSubpassDescription_getPInputAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pInputAttachments));
}

void Java_cz_mg_vulkan_vk_VkSubpassDescription_setPInputAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    memcpy(&o->pInputAttachments, jniLongToPointer(valueAddress), sizeof(o->pInputAttachments));
}
jlong Java_cz_mg_vulkan_vk_VkSubpassDescription_getColorAttachmentCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->colorAttachmentCount));
}

void Java_cz_mg_vulkan_vk_VkSubpassDescription_setColorAttachmentCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    memcpy(&o->colorAttachmentCount, jniLongToPointer(valueAddress), sizeof(o->colorAttachmentCount));
}
jlong Java_cz_mg_vulkan_vk_VkSubpassDescription_getPColorAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pColorAttachments));
}

void Java_cz_mg_vulkan_vk_VkSubpassDescription_setPColorAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    memcpy(&o->pColorAttachments, jniLongToPointer(valueAddress), sizeof(o->pColorAttachments));
}
jlong Java_cz_mg_vulkan_vk_VkSubpassDescription_getPResolveAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pResolveAttachments));
}

void Java_cz_mg_vulkan_vk_VkSubpassDescription_setPResolveAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    memcpy(&o->pResolveAttachments, jniLongToPointer(valueAddress), sizeof(o->pResolveAttachments));
}
jlong Java_cz_mg_vulkan_vk_VkSubpassDescription_getPDepthStencilAttachment(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pDepthStencilAttachment));
}

void Java_cz_mg_vulkan_vk_VkSubpassDescription_setPDepthStencilAttachment(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    memcpy(&o->pDepthStencilAttachment, jniLongToPointer(valueAddress), sizeof(o->pDepthStencilAttachment));
}
jlong Java_cz_mg_vulkan_vk_VkSubpassDescription_getPreserveAttachmentCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->preserveAttachmentCount));
}

void Java_cz_mg_vulkan_vk_VkSubpassDescription_setPreserveAttachmentCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    memcpy(&o->preserveAttachmentCount, jniLongToPointer(valueAddress), sizeof(o->preserveAttachmentCount));
}
jlong Java_cz_mg_vulkan_vk_VkSubpassDescription_getPPreserveAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pPreserveAttachments));
}

void Java_cz_mg_vulkan_vk_VkSubpassDescription_setPPreserveAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDescription* o = (VkSubpassDescription*)jniLongToPointer(address);
    memcpy(&o->pPreserveAttachments, jniLongToPointer(valueAddress), sizeof(o->pPreserveAttachments));
}

