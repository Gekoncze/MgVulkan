package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPeerMemoryFeatureFlags.html">khronos documentation</a>
 **/
public class VulkanPeerMemoryFeatureFlags extends VulkanFlags {
    public VulkanPeerMemoryFeatureFlags(){
        super(new VkPeerMemoryFeatureFlags());
    }

    public VulkanPeerMemoryFeatureFlags(VkPeerMemoryFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkPeerMemoryFeatureFlags getVk(){
        return (VkPeerMemoryFeatureFlags) super.getVk();
    }

    public VulkanPeerMemoryFeatureFlags(int value){
        super(new VkPeerMemoryFeatureFlags(value));
    }

    public static class Array extends VulkanPeerMemoryFeatureFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPeerMemoryFeatureFlags> {
        public Array(VkPeerMemoryFeatureFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPeerMemoryFeatureFlags.Array(count));
        }

        public Array(int count, VulkanPeerMemoryFeatureFlags o){
            this(new VkPeerMemoryFeatureFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPeerMemoryFeatureFlags.Array getVk(){
            return (VkPeerMemoryFeatureFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPeerMemoryFeatureFlags get(int i){
            return new VulkanPeerMemoryFeatureFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPeerMemoryFeatureFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPeerMemoryFeatureFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPeerMemoryFeatureFlags.Pointer(value));
        }

        @Override
        public VkPeerMemoryFeatureFlags.Pointer getVk(){
            return (VkPeerMemoryFeatureFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPeerMemoryFeatureFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPeerMemoryFeatureFlags.Pointer> {
            public Array(int count) {
                super(new VkPeerMemoryFeatureFlags.Pointer.Array(count));
            }

            public Array(VulkanPeerMemoryFeatureFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPeerMemoryFeatureFlags.Pointer.Array getVk(){
                return (VkPeerMemoryFeatureFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPeerMemoryFeatureFlags.Pointer get(int i){
                return new VulkanPeerMemoryFeatureFlags.Pointer(getVk().get(i));
            }
        }
    }
}
