#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSubresourceLayout_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSubresourceLayout);
}

jlong Java_cz_mg_vulkan_VkSubresourceLayout_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    return jniPointerToLong(&o->offset);
}

void Java_cz_mg_vulkan_VkSubresourceLayout_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->offset, valuePointer, sizeof(o->offset));
}

jlong Java_cz_mg_vulkan_VkSubresourceLayout_getSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    return jniPointerToLong(&o->size);
}

void Java_cz_mg_vulkan_VkSubresourceLayout_setSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->size, valuePointer, sizeof(o->size));
}

jlong Java_cz_mg_vulkan_VkSubresourceLayout_getRowPitch(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    return jniPointerToLong(&o->rowPitch);
}

void Java_cz_mg_vulkan_VkSubresourceLayout_setRowPitch(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->rowPitch, valuePointer, sizeof(o->rowPitch));
}

jlong Java_cz_mg_vulkan_VkSubresourceLayout_getArrayPitch(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    return jniPointerToLong(&o->arrayPitch);
}

void Java_cz_mg_vulkan_VkSubresourceLayout_setArrayPitch(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->arrayPitch, valuePointer, sizeof(o->arrayPitch));
}

jlong Java_cz_mg_vulkan_VkSubresourceLayout_getDepthPitch(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthPitch);
}

void Java_cz_mg_vulkan_VkSubresourceLayout_setDepthPitch(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubresourceLayout* o = (VkSubresourceLayout*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthPitch, valuePointer, sizeof(o->depthPitch));
}


