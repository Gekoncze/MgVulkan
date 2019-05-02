#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkExtent2D_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExtent2D);
}

void Java_cz_mg_vulkan_VkExtent2D_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkExtent2D));
}

jlong Java_cz_mg_vulkan_VkExtent2D_getWidthNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExtent2D* o = (VkExtent2D*)jniLongToPointer(address);
    return jniPointerToLong(&o->width);
}

void Java_cz_mg_vulkan_VkExtent2D_setWidthNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExtent2D* o = (VkExtent2D*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->width, valuePointer, sizeof(o->width));
}

jlong Java_cz_mg_vulkan_VkExtent2D_getHeightNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExtent2D* o = (VkExtent2D*)jniLongToPointer(address);
    return jniPointerToLong(&o->height);
}

void Java_cz_mg_vulkan_VkExtent2D_setHeightNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExtent2D* o = (VkExtent2D*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->height, valuePointer, sizeof(o->height));
}


