#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDrawIndexedIndirectCommand_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDrawIndexedIndirectCommand);
}

jlong Java_cz_mg_vulkan_VkDrawIndexedIndirectCommand_getIndexCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&o->indexCount);
}

void Java_cz_mg_vulkan_VkDrawIndexedIndirectCommand_setIndexCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->indexCount, valuePointer, sizeof(o->indexCount));
}

jlong Java_cz_mg_vulkan_VkDrawIndexedIndirectCommand_getInstanceCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&o->instanceCount);
}

void Java_cz_mg_vulkan_VkDrawIndexedIndirectCommand_setInstanceCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->instanceCount, valuePointer, sizeof(o->instanceCount));
}

jlong Java_cz_mg_vulkan_VkDrawIndexedIndirectCommand_getFirstIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&o->firstIndex);
}

void Java_cz_mg_vulkan_VkDrawIndexedIndirectCommand_setFirstIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->firstIndex, valuePointer, sizeof(o->firstIndex));
}

jlong Java_cz_mg_vulkan_VkDrawIndexedIndirectCommand_getVertexOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&o->vertexOffset);
}

void Java_cz_mg_vulkan_VkDrawIndexedIndirectCommand_setVertexOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->vertexOffset, valuePointer, sizeof(o->vertexOffset));
}

jlong Java_cz_mg_vulkan_VkDrawIndexedIndirectCommand_getFirstInstanceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&o->firstInstance);
}

void Java_cz_mg_vulkan_VkDrawIndexedIndirectCommand_setFirstInstanceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDrawIndexedIndirectCommand* o = (VkDrawIndexedIndirectCommand*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->firstInstance, valuePointer, sizeof(o->firstInstance));
}


