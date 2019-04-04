package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalFenceHandleTypeFlags.html">khronos documentation</a>
 **/
public class VulkanExternalFenceHandleTypeFlags extends VulkanFlags {
    public VulkanExternalFenceHandleTypeFlags(){
        super(new VkExternalFenceHandleTypeFlags());
    }

    public VulkanExternalFenceHandleTypeFlags(VkExternalFenceHandleTypeFlags vk){
        super(vk);
    }

    @Override
    public VkExternalFenceHandleTypeFlags getVk(){
        return (VkExternalFenceHandleTypeFlags) super.getVk();
    }

    public VulkanExternalFenceHandleTypeFlags(int value){
        super(new VkExternalFenceHandleTypeFlags(value));
    }

    public static class Array extends VulkanExternalFenceHandleTypeFlags implements cz.mg.collections.array.ReadonlyArray<VulkanExternalFenceHandleTypeFlags> {
        public Array(VkExternalFenceHandleTypeFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalFenceHandleTypeFlags.Array(count));
        }

        public Array(int count, VulkanExternalFenceHandleTypeFlags o){
            this(new VkExternalFenceHandleTypeFlags.Array(count, o.getVk()));
        }

        @Override
        public VkExternalFenceHandleTypeFlags.Array getVk(){
            return (VkExternalFenceHandleTypeFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalFenceHandleTypeFlags get(int i){
            return new VulkanExternalFenceHandleTypeFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalFenceHandleTypeFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalFenceHandleTypeFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalFenceHandleTypeFlags.Pointer(value));
        }

        @Override
        public VkExternalFenceHandleTypeFlags.Pointer getVk(){
            return (VkExternalFenceHandleTypeFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalFenceHandleTypeFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalFenceHandleTypeFlags.Pointer> {
            public Array(int count) {
                super(new VkExternalFenceHandleTypeFlags.Pointer.Array(count));
            }

            public Array(VulkanExternalFenceHandleTypeFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalFenceHandleTypeFlags.Pointer.Array getVk(){
                return (VkExternalFenceHandleTypeFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalFenceHandleTypeFlags.Pointer get(int i){
                return new VulkanExternalFenceHandleTypeFlags.Pointer(getVk().get(i));
            }
        }
    }
}
