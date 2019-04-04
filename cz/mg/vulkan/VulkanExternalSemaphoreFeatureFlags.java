package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalSemaphoreFeatureFlags.html">khronos documentation</a>
 **/
public class VulkanExternalSemaphoreFeatureFlags extends VulkanFlags {
    public VulkanExternalSemaphoreFeatureFlags(){
        super(new VkExternalSemaphoreFeatureFlags());
    }

    public VulkanExternalSemaphoreFeatureFlags(VkExternalSemaphoreFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkExternalSemaphoreFeatureFlags getVk(){
        return (VkExternalSemaphoreFeatureFlags) super.getVk();
    }

    public VulkanExternalSemaphoreFeatureFlags(int value){
        super(new VkExternalSemaphoreFeatureFlags(value));
    }

    public static class Array extends VulkanExternalSemaphoreFeatureFlags implements cz.mg.collections.array.ReadonlyArray<VulkanExternalSemaphoreFeatureFlags> {
        public Array(VkExternalSemaphoreFeatureFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalSemaphoreFeatureFlags.Array(count));
        }

        public Array(int count, VulkanExternalSemaphoreFeatureFlags o){
            this(new VkExternalSemaphoreFeatureFlags.Array(count, o.getVk()));
        }

        @Override
        public VkExternalSemaphoreFeatureFlags.Array getVk(){
            return (VkExternalSemaphoreFeatureFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalSemaphoreFeatureFlags get(int i){
            return new VulkanExternalSemaphoreFeatureFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalSemaphoreFeatureFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalSemaphoreFeatureFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalSemaphoreFeatureFlags.Pointer(value));
        }

        @Override
        public VkExternalSemaphoreFeatureFlags.Pointer getVk(){
            return (VkExternalSemaphoreFeatureFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalSemaphoreFeatureFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalSemaphoreFeatureFlags.Pointer> {
            public Array(int count) {
                super(new VkExternalSemaphoreFeatureFlags.Pointer.Array(count));
            }

            public Array(VulkanExternalSemaphoreFeatureFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalSemaphoreFeatureFlags.Pointer.Array getVk(){
                return (VkExternalSemaphoreFeatureFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalSemaphoreFeatureFlags.Pointer get(int i){
                return new VulkanExternalSemaphoreFeatureFlags.Pointer(getVk().get(i));
            }
        }
    }
}
