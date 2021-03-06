#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPhysicalDeviceSparseProperties);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPhysicalDeviceSparseProperties));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_getResidencyStandard2DBlockShapeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->residencyStandard2DBlockShape);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_setResidencyStandard2DBlockShapeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->residencyStandard2DBlockShape, valuePointer, sizeof(o->residencyStandard2DBlockShape));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_getResidencyStandard2DMultisampleBlockShapeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->residencyStandard2DMultisampleBlockShape);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_setResidencyStandard2DMultisampleBlockShapeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->residencyStandard2DMultisampleBlockShape, valuePointer, sizeof(o->residencyStandard2DMultisampleBlockShape));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_getResidencyStandard3DBlockShapeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->residencyStandard3DBlockShape);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_setResidencyStandard3DBlockShapeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->residencyStandard3DBlockShape, valuePointer, sizeof(o->residencyStandard3DBlockShape));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_getResidencyAlignedMipSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->residencyAlignedMipSize);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_setResidencyAlignedMipSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->residencyAlignedMipSize, valuePointer, sizeof(o->residencyAlignedMipSize));
}

jlong Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_getResidencyNonResidentStrictNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->residencyNonResidentStrict);
}

void Java_cz_mg_vulkan_VkPhysicalDeviceSparseProperties_setResidencyNonResidentStrictNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPhysicalDeviceSparseProperties* o = (VkPhysicalDeviceSparseProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->residencyNonResidentStrict, valuePointer, sizeof(o->residencyNonResidentStrict));
}


