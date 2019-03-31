#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSubresourceLayout_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSubresourceLayout);
}

jlong Java_cz_mg_vulkan_vk_VkSubresourceLayout_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    return jniPointerToLong(&(o->offset));
}

void Java_cz_mg_vulkan_vk_VkSubresourceLayout_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    memcpy(&o->offset, jniLongToPointer(valueAddress), sizeof(o->offset));
}
jlong Java_cz_mg_vulkan_vk_VkSubresourceLayout_getSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    return jniPointerToLong(&(o->size));
}

void Java_cz_mg_vulkan_vk_VkSubresourceLayout_setSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    memcpy(&o->size, jniLongToPointer(valueAddress), sizeof(o->size));
}
jlong Java_cz_mg_vulkan_vk_VkSubresourceLayout_getRowPitch(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    return jniPointerToLong(&(o->rowPitch));
}

void Java_cz_mg_vulkan_vk_VkSubresourceLayout_setRowPitch(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    memcpy(&o->rowPitch, jniLongToPointer(valueAddress), sizeof(o->rowPitch));
}
jlong Java_cz_mg_vulkan_vk_VkSubresourceLayout_getArrayPitch(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    return jniPointerToLong(&(o->arrayPitch));
}

void Java_cz_mg_vulkan_vk_VkSubresourceLayout_setArrayPitch(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    memcpy(&o->arrayPitch, jniLongToPointer(valueAddress), sizeof(o->arrayPitch));
}
jlong Java_cz_mg_vulkan_vk_VkSubresourceLayout_getDepthPitch(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthPitch));
}

void Java_cz_mg_vulkan_vk_VkSubresourceLayout_setDepthPitch(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    memcpy(&o->depthPitch, jniLongToPointer(valueAddress), sizeof(o->depthPitch));
}

